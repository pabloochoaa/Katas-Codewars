object Kata1 {
  def validBraces(s: String): Boolean ={
    var valid: Boolean = true
    if(s.length > 1){
      s(0) match{
        case '('  => if( s(1) == ')' || s(s.length-1) == ')'){valid = true} else {
          if(s.lastIndexOf(')') != -1){
            valid = validBraces(s.replace(')', ' ').substring(1, s.length))
          }else valid = false
        }
        case '['  => if( s(1) == ']' || s(s.length-1) == ']')  valid = true else {
          if(s.lastIndexOf(']') != -1){
            valid = validBraces(s.replace(']', ' ').substring(1, s.length))
          }else valid = false
        }
        case '{'  => if( s(1) == '}' || s(s.length-1) == '}')  valid = true else {
          if(s.lastIndexOf('}') != -1){
            valid = validBraces(s.replace('}', ' ').substring(1, s.length))
          }else valid = false
        }
        case _ => valid = false
      }
      if(s.length != 2 && valid){
        if(s(1) == ')'  || s(1) == '}'  || s(1) == ']' ){
          valid = validBraces(s.substring(2, s.length))
        }else{
          valid = validBraces(s.substring(1, s.length-1))
        }
      }
    }else{
      valid = false
    }

    if(s.length == 0){
      valid = true
    }
    valid
  }
}

Kata1.validBraces("()")
Kata1.validBraces("[()]")
Kata1.validBraces("[(])")
Kata1.validBraces("([{}])")
Kata1.validBraces("([{]})")
Kata1.validBraces("{[({}){}()[]]}")

var a = "{}({})[]"
a.substring(2,a.length)
a.lastIndexOf("a")
