//Time Complexity = O(n)
//Space Compelexity = O(n)

//Approach: Use a Queue to add root first then while queue is not empty get all its children and add them to an arraylist and and add that array list to the result. Return the result.  

publc class BFSLevelOrderTraversal{
public List<List<Integer>> levelOrder(TreeNode root) {
List<List<Integer>> result = new ArrayList<>();
        if(root== null){return result;}
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                l.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            result.add(l);
        }
        return result;
}
}
