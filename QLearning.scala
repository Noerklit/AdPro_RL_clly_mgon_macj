package adpro.Q

import adpro.state.*
import adpro.state.RNG.Simple
import scala.util.Random
import adpro.state.RNG.Rand

class Q[S,A]:

    type Q[S, A] = Map[S, Map[A, Double]]

    type Policy[S, A] = Map[S, A]

    val gamma = 1.0
    val alpha = 0.0
    val epsilon = 0.1

    
    def episode(s: S) (q : Q[S, A] ) : Q[S, A] =
        val action = greedyEpsilon(s)(q)
        val (s_m, r) = step(s)(action)
        

    
    def step(s: S)(a: A) : (S, Double) = ??? 

    def greedyEpsilon (s : S) (q : Q[S, A]): A = 
        val random = RNG.Simple(42)
        if epsilon < RNG.double(random)._1 then
            q.getOrElse(s, Map.empty).maxBy(a => a._2)._1
        else 
            val list = q.getOrElse(s, Map.empty).toList
            val rand = Random.nextInt(list.length)
            list(rand)._1


    
