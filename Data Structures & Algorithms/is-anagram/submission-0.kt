class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var s1 = s.toCharArray().sorted()
        var s2 = t.toCharArray().sorted()
        return s1 == s2
    }
}
