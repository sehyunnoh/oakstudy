var longestPalindrome = function(s) {
    if (s.length === 1 || checkPalindrom(s)) return s
    
    let sub = ''
    let max = ''

    for (let i = 0; i < s.length; i++) {
        for (let end = s.length; end > i; end-- ) {
            if (max.length > end - i -1 ) break
            
            sub = s.substring(i, end)
            if (checkPalindrom(sub)) {
                max = sub.length > max.length ? sub : max
                break;
            }
        }
    }
    return max    
    
};

function checkPalindrom(sub) {
    if (sub.length === 1) return true
    
    for (let i = 0; i < sub.length / 2; i++) {
        if (sub[i] != sub[sub.length - i-1]) return false
    }
    
    return true
}