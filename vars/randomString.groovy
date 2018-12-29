package li.malago

def generator = { String alphabet, int n ->
  new Random().with {
    (1..n).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
  }
}


def call(int size){
    return generator( (('A'..'Z')+('0'..'9')).join(), size )
}