import adpro.state.RNG.int

enum Action:
    case Up, Down, Left, Right

type CliffMap = List[List[Int]]

// Starting coordinates of the agent
def startCoords : (Int, Int) = (0,0)

// Simple definition of the coordinate set the agent should try to get to
def goal : (Int, Int) = (0, 11)

// Define for each direction when a move won't be legal, i.e a move will go outside the defined map
// Should this maybe just be the one function that returns all valid moves based on current coords?
def canMoveRight (coords:(Int, Int)) : Boolean = if coords._1 + 1 > 11 then false else true
def canMoveLeft (coords:(Int, Int)) : Boolean = if coords._1 - 1 < 0 then false else true
def canMoveUp (coords:(Int, Int)) : Boolean = if coords._2 + 1 > 3 then false else true
def canMoveDown (coords:(Int, Int)) : Boolean = if coords._2 - 1 < 0 then false else true

// The step function takes the current coordinates of the agent 
// and probably a list of possible actions/moves or have we already looked at the legal moves and defined
// whether we take the one that has the highest reward or one at random when we call step?
def step (coords: (Int, Int), action: Action) : ??? = ???

def coords : (Int, Int) = ???

// Initializes the specific board/map for the cliffwalking problem
def initCliffMap : CliffMap =
    List(
        List(-1, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, 100), // Row 0 in figure
        List(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1), // Row 1 in figure
        List(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1), // Row 2 in figure
        List(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1), // Row 3 in figure
    )

