/**
 * @param {number} x
 * @return {number}
 */
 var reverse = function(x) {
    
    const strX = ''+x;
    
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
    
    const reversedX = +strReversed;
    
    return (reversedX < -2147483648 || reversedX > 2147483647) ? 0: reversedX
}