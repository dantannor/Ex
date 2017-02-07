import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 2/6/2017.
 */
public class FindMax {
    public ArrayList<Integer> findMax(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        if (root.left == null && root.right == null)
            return new ArrayList<>(asList(root.val));

        ArrayList<Integer> left = findMax(root.left);
        ArrayList<Integer> right = findMax(root.right);

        if (left.size() >= right.size()) {
            left.add(root.val);
            return left;
        } else {
            right.add(root.val);
            return right;
        }
    }

//    public ArrayList<Integer> findMax(TreeNode root) {
//        if(root == null)
//            return new ArrayList<>();
//
//        if(root.left == null && root.right == null)
//            return new ArrayList<>(asList(root.val));
//
//        ArrayList<Integer> res = new ArrayList<>();
//        ArrayList<Integer> left = findMax(root.left);
//        ArrayList<Integer> right = findMax(root.right);
//
//        res.add(root.val);
//        if(left.size() >= right.size())
//            res.addAll(left);
//        else
//            res.addAll(right);
//
//        return res;
//    }

//    public ArrayList<Integer> findMax(TreeNode root) {
//        ArrayList<Integer> lst = new ArrayList<>();
//        lst = findMaxHelper(root, lst);
//        return lst;
//    }
//
//    public ArrayList<Integer> findMaxHelper(TreeNode root, ArrayList<Integer> lst) {
//        if(root == null)
//            return lst;
//
//        lst.add(root.val);
//        if (root.right == null && root.left == null) {
//            return lst;
//        }
//        if (root.right != null && root.left == null) {
//            return findMaxHelper(root.right, lst);
//        }
//        if (root.right == null && root.left != null) {
//            return findMaxHelper(root.left, lst);
//        }
//        if (findMaxHelper(root.left, lst).size() >= findMaxHelper(root.right, lst).size()) {
//            return findMaxHelper(root.left, lst);
//        } else {
//            return findMaxHelper(root.right, lst);
//        }
//
//
//    }
}
