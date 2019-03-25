trait A
trait B extends A

object O {
  opaque type T[X <: A] = X
  type U = T.U
  object T{
    type U[X <: A] = X
    def t(a: T[B]): T[B] = a
    def u(a: U[B]): U[B] = a
  }
  def t(a: T[B]): T[B] = a
  def u(a: T.U[B]): T.U[B] = a
}