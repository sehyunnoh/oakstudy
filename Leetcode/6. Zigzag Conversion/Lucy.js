/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
 var convert = function(s, numRows) {
    if (numRows === 1) return s
    
    const interval = 2 * numRows - 2 // number of letters in the repeated pattern 
    let strArray = Array(numRows).fill('');
    let iMod

    for (i = 0; i < s.length; i++) {

        iMod = (i % interval) // get a remainder of index (i) divide by interval 
        if ( iMod < numRows ) { 
            strArray[iMod]  += s[i]
       } else {
           strArray[interval - iMod]  += s[i]
       }
            
    }
    
    return strArray.join('')
};