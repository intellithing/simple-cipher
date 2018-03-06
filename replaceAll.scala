val hw = "hello world"
val Pattern = "([a-z])".r
def cipher (c: Char):Char = ((c.toByte-97+13)%26+97).toChar
val hw_ciphered = Pattern.replaceAllIn(hw, m => m.group(0).map(cipher))
print (hw_ciphered)
