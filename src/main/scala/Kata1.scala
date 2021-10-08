object Kata1{
  def validBraces(s: String): Boolean ={
    var valid: Boolean = true
    if(s.length > 1){
      s(0) match{
        case '('  => if( s(1) == ')' || s(s.length-1) == ')'){
          if(s.length != 2){
            if(s(1) == ')'){
              valid = validBraces(s.substring(2, s.length))
            }else{
              valid = validBraces(s.substring(1, s.length-1))
            }
          }
        } else {
          if(s.lastIndexOf(')') != -1){
            var newS = s.substring(0, s.indexOf(')')).concat(s.substring(s.indexOf(')')+1, s.length))
            valid = validBraces(newS.substring(1, s.length-1))
          }else valid = false
        }
        case '['  => if( s(1) == ']' || s(s.length-1) == ']') {
          if(s.length != 2){
            if(s(1) == ']'){
              valid = validBraces(s.substring(2, s.length))
            }else{
              valid = validBraces(s.substring(1, s.length-1))
            }
          }
        } else {
          if(s.lastIndexOf(']') != -1){
            var newS = s.substring(0, s.indexOf(']')).concat(s.substring(s.indexOf(']')+1, s.length))
            valid = validBraces(newS.substring(1, s.length-1))
          }else valid = false
        }
        case '{'  => if( s(1) == '}' || s(s.length-1) == '}') {
          if(s.length != 2){
            if(s(1) == '}'){
              valid = validBraces(s.substring(2, s.length))
            }else{
              valid = validBraces(s.substring(1, s.length-1))
            }
          }
        } else {
          if(s.lastIndexOf('}') != -1){
            var newS = s.substring(0, s.indexOf('}')).concat(s.substring(s.indexOf('}')+1, s.length))
            valid = validBraces(newS.substring(1, s.length-1))
          }else valid = false
        }
        case _ => valid = false
      }
      /*if(s.length != 2 && valid){
        if(s(1) == ')'  || s(1) == '}'  || s(1) == ']' ){
          valid = validBraces(s.substring(2, s.length))
        }else{
          valid = validBraces(s.substring(1, s.length-1))
        }
      }*/
    }else{
      valid = false
    }

    if(s.isEmpty){
      valid = true
    }
    valid
  }

  def main (args: Array[String]): Unit ={
    var a = Kata1.validBraces("{({{()}({}())})}")//true
    println(a)
    var b = Kata1.validBraces("({]}{")//false
    println(b)
  }

}


