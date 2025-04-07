public class Main {
    public static void main(String[] args) {



        int[] bcasket = new int[]{5, 6, 12};


        double[] bag = {1.57, 7.654, 9.986};


        int[] pannier = {10, 11, 13, 14};


        int[] bcasket1 = new int[]{5, 6, 12};
        for (int i = 0; i < bcasket1.length; i++) {
            System.out.println(bcasket1[i]);
        }

        int[] bcasket2 = new int[]{5, 6, 12};
        for (int i = bcasket2.length - 1; i >= 0; i--) {
            System.out.println(bcasket1[i]);
        }


        double[] bag1 = {1.57, 7.654, 9.986};
        for (int a = 0; a < bag1.length; a++) {
            System.out.println(bag1[a]);
        }

        double[] bag2 = {1.57, 7.654, 9.986};
        for (int i = bag2.length - 1; i >= 0; i--) {
            System.out.println(bag2[i]);
        }


        int[] pannier1 = {10, 11, 13, 14};
        for (int a = 0; a < pannier1.length; a++) {
            System.out.println(pannier1[a]);
        }

        int[] pannier2 = {10, 11, 13, 14};
        for (int i = pannier2.length - 1; i >= 0; i--) {
            System.out.println(pannier2[i]);
        }



        int[] bcasket5 = new int[]{5, 6, 12};
        for (int i = 0; i < bcasket.length; i++) {
            if (bcasket[i] % 2 == 0) {
                bcasket[i] += 1;
            }
        }

        for (int num : bcasket) {
            System.out.print(num + " ");
        }


    }


}
