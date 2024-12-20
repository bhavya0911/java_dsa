public class Route {
    public static void main(String args[]) {
        String direction = "WNEENESENNN";
        System.out.println(cal(direction));
    }

    public static int cal(String direction) {
        int x = 0, y = 0;
        for(int i = 0; i < direction.length(); i++) {
            if(direction.charAt(i) == 'W') {
                x--;
            } else if(direction.charAt(i) == 'E') {
                x++;
            } else if(direction.charAt(i) == 'N') {
                y++;
            } else if(direction.charAt(i) == 'S') {
                y--;
            }
        }
        return (int)Math.sqrt((x*x) + (y*y));
    }
}
