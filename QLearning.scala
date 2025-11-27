package adpro.Q

import adpro.state.*
import adpro.state.RNG.Simple
import scala.util.Random
import adpro.state.RNG.Rand
import java.awt.Desktop.Action

class Q[S,A]:

    type Q[S, A] = Map[S, Map[A, Double]]

    type Policy[S, A] = Map[S, A]

    val gamma = 1.0
    val alpha = 0.1
    val epsilon = 0.1

    def init = ???

    def episode(s: S) (q : Q[S, A] ) (step: (S, A) => (S, Double)) (terminalState: S) : Q[S,A] =
        val action = greedyEpsilon(s)(q)
        val (nextState, reward) = step(s, action)
        val updatedQ = update(s, q, nextState, reward, action)
        if (nextState != terminalState) then
            episode(nextState)(updatedQ)(step)(terminalState)
        else
            q
        

    def update(state: S, q: Q[S, A], nextState: S, reward: Double, action: A) : Q[S, A] = 
        val maxNextQ = q.getOrElse(state, Map.empty).values.maxOption.getOrElse(0.0)
        val currentQ = q.getOrElse(state, Map.empty).getOrElse(action, 0.0)
        val updated = currentQ + alpha * (reward + (gamma*maxNextQ) - currentQ)
        val updatedInnerMap = q.getOrElse(state, Map.empty) + (action -> updated)
        q + (state -> updatedInnerMap)


    def greedyEpsilon (s : S) (q : Q[S, A]): A = 
        val random = RNG.Simple(42)
        if epsilon < RNG.double(random)._1 then
            q.getOrElse(s, Map.empty).maxBy(a => a._2)._1
        else 
            val list = q.getOrElse(s, Map.empty).toList
            val rand = Random.nextInt(list.length)
            list(rand)._1


    
