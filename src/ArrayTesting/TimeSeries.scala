package ArrayTesting

import scala.collection.mutable;

object TimeSeries {
  def main(args: Array[String]) {
  //  var A:Array[Int] = new Array[Int](10);
    //var A = scala.collection.mutable.ArrayBuffer(7,8,9,10,2,3,4,5,6,1);
    var A = scala.collection.mutable.ArrayBuffer(1,2,3,4,5,6,7,8,9,10);
    //var A = scala.collection.mutable.ArrayBuffer(10,9,8,7,6,5,4,3,2,1);
    var TT=0;
    timereq(3,A);
    def timereq(nth : Int, A: scala.collection.mutable.ArrayBuffer[Int]) = {
      var iter= A(nth -1);
      for(i<- 1 to iter-1){
        println(i);
        for (j<- 0 to A.length -1)
        {
          A(j)=A(j)-1;
        }
        println(A);
        TT = TT+ A.length;
        var iter2=0;
        for (k<- A)
        {
          if (k==0) {//iter2=iter2-1;
            //println(iter2);
          A.remove(iter2);println(A);} else iter2=iter2+1;
          
        }
        println(TT);
      }
      println(TT+ nth);
    }

  }
}