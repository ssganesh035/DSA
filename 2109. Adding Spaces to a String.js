/**
 * @param {string} s
 * @param {number[]} spaces
 * @return {string}
 */
var addSpaces = function(s, spaces) {
    let ans='';
    let curr=0;
    for(let i= 0;i<spaces.length;i++) {
        ans+=s.substring(curr, spaces[i])+" ";
        curr= spaces[i];
    }
    ans+=s.substring(curr, s.length);
    return ans;
};
