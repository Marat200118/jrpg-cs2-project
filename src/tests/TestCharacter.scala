import org.scalatest._

class TestCharacter extends FunSuite {
  test("Creating a new character") {
    var char1: Character = new Character()
    assert(char1.maxHP === 100)
    assert(char1.currentHP === 100)
    assert(char1.attackPower === 30)
    assert(char1.defence === 20)
    assert(char1.magicAttack === 40)
    assert(char1.magicAttackAvailable === 2)
    assert(char1.magicDefence === 40)
    assert(char1.maxMagicPoints === 3)
  }
  test("Hp reducing after the attack") {
    var char2:  Character = new Character()
    var char3:  Character = new Character()
    char2.physicalAttack(char3)
    assert(char2.currentHP === 90)
  }
  test ("Hp reducing after magicAttack") {
    var char4:  Character = new Character()
    var char5:  Character = new Character()
    char4.magicalAttack(char5)
    assert(char4.currentHP === 80)
  }
}
