import adpro.state.RNG.int

enum Action:
    case Up, Down, Left, Right

type CliffMap = List[List[Int]]

def startCoords : (Int, Int) = (0,0)

def goal : (Int, Int) = (0, 11)

def canMoveRight = ???
def canMoveRight = ???
def canMoveRight = ???
def canMoveRight = ???


def step (coords: (Int, Int), action: ) = ???

def coords : (Int, Int) = ???

def initCliffMap : CliffMap =
    List(
        List(-1, -100, -100, -100, -100, -100, -100, -100, -100, -100, 100), // Row 0 in figure
        List(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1), // Row 1 in figure
        List(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1), // Row 2 in figure
        List(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1), // Row 3 in figure
    )

