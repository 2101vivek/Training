package ArrayTesting


object MaxDiff{
  def main(args: Array[String]) {
  //  var A:Array[Int] = new Array[Int](10);
    var A = Array(7,8,9,10,2,3,4,5,6,1);
   // var A = Array(1,2,3,4,5,6,7,8,9,10);
    //var A = Array(10,9,8,7,6,5,4,3,2,1);
    var Max = 0;

def Max_Diff (B: Array[Int]) = {
       
      for (i <- 0 to B.length-1){
        for ( j <- i+1 to B.length-1){
          if (B(j) > B(i)) {
            if (B(j) - B(i) > Max)
            {
              Max= B(j) - B(i);
            }
            
          }
        }
      }
    } 
    if (Max==0) Max = -1;
    println(Max);
  }
}