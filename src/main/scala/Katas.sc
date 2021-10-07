object Kata1{
  def validBraces(s: String): Boolean ={
    var valid: Boolean = false
    s(0) match{
      case '('  => if( s(1) == ')' || s(s.length-1) == ')')  valid = true
      case '['  => if( s(1) == ']' || s(s.length-1) == ']')  valid = true
      case '{'  => if( s(1) == '}' || s(s.length-1) == '}')  valid = true
      case _ => valid = false
    }
    if(s.length != 2){
      valid = validBraces(s.substring(1, s.length-1))
    }
    valid
  }
}

Kata1.validBraces("()")
Kata1.validBraces("[()]")
Kata1.validBraces("[(])")
Kata1.validBraces("([{}])")
Kata1.validBraces("([{]})")
