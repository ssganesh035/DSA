var mergeArrays = function(nums1, nums2) {
    let ans= [];
    let hm= new Map();
    for(let i=0;i<nums1.length;i++) {
        hm.set(nums1[i][0],nums1[i][1]);
    }
    for(let i=0;i<nums2.length;i++) {
        let id= nums2[i][0];
        let value= nums2[i][1];
        if(hm.has(id)) {
            hm.set(id,hm.get(id)+value);
        }
        else hm.set(id,value);
    }
    for(let key of hm.keys()) {
        ans.push([key,hm.get(key)]);
    }
    return ans.sort((a,b)=> a[0]-b[0]);
};
