object que2{
    def main(args:Array[String]):Unit = {
      val x = new RationalNum(3, 4)
      val y = new RationalNum(5, 8)
      val z = new RationalNum(2, 7)
      println(x.sub(y).sub(z))

    }

}


class RationalNum(a: Int, b: Int) {
def num = a
def denum = b

def sub(r: RationalNum) =new RationalNum(this.num * r.denum - r.num * this.denum, this.denum * r.denum)

override def toString = this.num.toString + "\\" + this.denum.toString
}