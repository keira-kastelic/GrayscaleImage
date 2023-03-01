public class GrayscaleImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public GrayscaleImage() {
        pixelValues = new int[4][5];
        pixelValues[0][0] = 255;
        pixelValues[0][1] = 184;
        pixelValues[0][2] = 178;
        pixelValues[0][3] = 84;
        pixelValues[0][4] = 129;
        pixelValues[1][0] = 84;
        pixelValues[1][1] = 255;
        pixelValues[1][2] = 255;
        pixelValues[1][3] = 130;
        pixelValues[1][4] = 84;
        pixelValues[2][0] = 78;
        pixelValues[2][1] = 255;
        pixelValues[2][2] = 0;
        pixelValues[2][3] = 0;
        pixelValues[2][4] = 78;
        pixelValues[3][0] = 84;
        pixelValues[3][1] = 130;
        pixelValues[3][2] = 255;
        pixelValues[3][3] = 130;
        pixelValues[3][4] = 84;
    }

    public int countWhitePixels() {
        int white = 0; // creating a variable to track the amount of white pixels in the array
        for(int rows = 0; rows < pixelValues.length; rows++){ // creating a for loop to loop through the rows of the array
            for(int cols = 0; cols < pixelValues[rows].length; cols++){ // creating a for loop to loop through the columns of the array
                if(pixelValues[rows][cols] == 255){ // creating an if statement to see if the value at the index is 225 (white)
                    white++; // if so, updating the white variable
                }
            }
        }
        return white; // returning white
    }

    public void processImage(){
        for(int rows = 0; rows < pixelValues.length; rows++){ // creating a for loop to loop[ through the rows of the array
            for(int cols = 0; cols < pixelValues[rows].length; cols++){ // creating a for loop to loop through the columns of the array
                if(rows + 2 < pixelValues.length && cols + 2 < pixelValues[rows].length){ // checking to see if the index + 2 is in bounds
                    pixelValues[rows][cols] -= pixelValues[rows + 2][cols + 2]; // subtracting the value at the array two down and two over
                    if(pixelValues[rows][cols] < 0){ // checking to see if the value is negative
                        pixelValues[rows][cols] = 0; // if so, setting it to 0 (black)
                    }
                }
            }
        }
    }

    //testing method created for you
    public void printPixels() {
        for (int row = 0; row < pixelValues.length; row++ ) {
            for (int col = 0; col < pixelValues[row].length; col++) {
                int val = pixelValues[row][col];
                if (val < 10) {
                    System.out.print(val + "    ");
                } else if (val < 100) {
                    System.out.print(val + "   ");
                } else {
                    System.out.print(val + "  ");
                }
            }
            System.out.println();
        }
    }



}
