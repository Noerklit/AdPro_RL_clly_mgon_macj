package adpro.Q

import adpro.state.*

enum Action:
    case Up, Down, Left, Right

type Q[State, Action] = Map[State, Map[Action, Double]]

type Policy[State, Action] = Map[State, Action]

val gamma = 1.0
