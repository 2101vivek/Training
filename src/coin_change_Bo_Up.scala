

object coin_change_Bo_Up {
  
    def main(args: Array[String]){
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        var c = new Array[Long](m);
        for(c_i <- 0 to m-1) {
           c(c_i) = sc.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'


        def count(c: Array[Long],m:Int,n:Int): Long={
            var list=List.fill(n+1)(0);
            var Ar=new Array[Long](n+1);
            for(i<-0 to n ){
              Ar(i)=0;
            }            
            Ar(0)=1;
            for(i<-0 to m-1){
              for(j<-c(i).toInt to n){
                Ar(j) += Ar(j-c(i).toInt);
              }
            }
              Ar(n);
        }
        var result=count(c,m,n);
        println(result);
    }
}
