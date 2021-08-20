object que1{
    def main(args:Array[String]):Unit = {
      val y = new RationalNum(5, 3)
      println(y.neg)

    }

}

class RationalNum(a: Int, b: Int) {
  def num = a
  def denum = b

  def +(r: RationalNum) = new RationalNum(this.num * r.denum + r.num * this.denum, denum * r.denum)
  def neg = new RationalNum(-this.num,this.denum)
  def -(r:RationalNum) = this+r.neg

  override def toString = this.num.toString + "\\" + this.denum.toString
}