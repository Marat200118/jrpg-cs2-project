class Character () {
  var maxHP: Int = 100
  var currentHP: Int = 100
  var attackPower: Int = 30
  var defence: Int = 20
  var magicAttack: Int = 40
  var magicAttackAvailable: Int = 2
  var magicDefence: Int = 40
  var maxMagicPoints: Int = 3
  var live: Boolean = true

  def main(args: Array[String]): Unit = {

  }

  def takeDamage(damage: Int): Unit = {
    this.currentHP = currentHP - damage
    if (this.currentHP < 1) {
      this.live = false
    }
  }
  def physicalAttack(attacker: Character): Unit = {
    var doneDamage: Int = attacker.defence - this.attackPower
    if (doneDamage < 0) {
      doneDamage = doneDamage * -1
      takeDamage(doneDamage)
    }
  }
  def magicalAttack(attacker: Character): Unit = {
    var doneDamage: Int = attacker.defence - this.magicAttack
    this.magicAttackAvailable = magicAttackAvailable - 1
    if (doneDamage < 0) {
      doneDamage = doneDamage * -1
      takeDamage(doneDamage)
    }
  }
}
