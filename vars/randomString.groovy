package li.malago

def call(int size){
  return new Random().with {(1..size).collect {(('a'..'z')).join()[ nextInt((('a'..'z')).join().length())]}.join()}
}