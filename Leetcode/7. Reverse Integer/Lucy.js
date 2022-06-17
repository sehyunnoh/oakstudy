/**
 * @param {number} x
 * @return {number}
 */
 var reverse = function(x) {
    
    const strX = x.toString()
    
    let strReversed = ''
    let end =  0
    
    if (x < 0) {
        strReversed += '-'
        end++
    }
    
    // range -2147483648 <= reversedX >= 2147483647
    for(let i = (strX.length -1); i >= end; i--) {        
        strReversed += strX[i]
    }
    
    const reversedX = parseInt(strReversed)
    
    if(reversedX < -2147483648 || reversedX > 2147483647) {
        return 0
    }
    
    return reversedX
}