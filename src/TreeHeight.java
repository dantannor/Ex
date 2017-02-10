import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 2/6/2017.
 */
public class TreeHeight {
    public ArrayList<Integer> getHeightRoute(TreeNode node) {
        if(node == null)
            return new ArrayList<>();
        if (node.left == null && node.right == null)
            return new ArrayList<>(asList(node.val));

        ArrayList<Integer> leftRoute = getHeightRoute(node.left);
        ArrayList<Integer> rightRoute = getHeightRoute(node.right);

        ArrayList<Integer> res = leftRoute.size() >= rightRoute.size() ?
                                    leftRoute :
                                    rightRoute;
        res.add(node.val);

        return res;
   }
}
