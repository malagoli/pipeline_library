package li.malago



def call(int size){
  def generator = { String alphabet, int n ->
    new Random().with {
      (1..n).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
    }
  }


  return generator( (('A'..'Z')+('0'..'9')).join(), size )
}