package MineSweeper;

public class Board {
    Cell [][] grid;
    private int bombsNumber;

    public Board(int row, int column, int bombsNumber){
        grid = new Cell [row][column];
        this.bombsNumber = bombsNumber;
        bombGenerator();
    }

    public void bombGenerator(){
        double value;
        while(this.bombsNumber != 0){
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if(this.grid[i][j] == null || !this.grid[i][j].getName().equalsIgnoreCase("bomb")){
                        value = Math.random();
                        if(value < 0.10){
                            this.grid[i][j] = new Cell("bomb", "\uD83D\uDCA3");
                            this.bombsNumber--;
                            if(this.bombsNumber == 0){
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public void cellNearBomb(){
        int count = 0;
        for(int row = 0; row < this.grid.length; row++){
            for(int col = 0; col < this.grid[0].length; col++){
                if(col == 0){
                    if(row == 0){
                        if(isABomb(row, col+1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col) == true){
                            count++;
                        }
                        if(isABomb(row+1, col+1) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }else if(row > 0 && row < this.grid.length-1){
                        if(isABomb(row-1, col) == true){
                            count++;
                        }
                        if(isABomb(row-1, col+1) == true){
                            count++;
                        }
                        if(isABomb(row, col+1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col) == true){
                            count++;
                        }
                        if(isABomb(row+1, col+1) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }else{
                        if(isABomb(row-1, col) == true){
                            count++;
                        }
                        if(isABomb(row-1, col+1) == true){
                            count++;
                        }
                        if(isABomb(row, col+1) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }
                }else if(col > 0 && col < this.grid[0].length-1){
                    if(row == 0){
                        if(isABomb(row, col-1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col-1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col) == true){
                            count++;
                        }
                        if(isABomb(row+1, col+1) == true){
                            count++;
                        }
                        if(isABomb(row-1, col+1) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }else if(row > 0 && row < this.grid.length-1){
                        if(isABomb(row-1, col-1) == true){
                            count++;
                        }
                        if(isABomb(row, col-1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col-1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col) == true){
                            count++;
                        }
                        if(isABomb(row+1, col+1) == true){
                            count++;
                        }
                        if(isABomb(row, col+1) == true){
                            count++;
                        }
                        if(isABomb(row-1, col+1) == true){
                            count++;
                        }
                        if(isABomb(row-1, col) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }else{
                        if(isABomb(row, col-1) == true){
                            count++;
                        }
                        if(isABomb(row-1, col-1) == true){
                            count++;
                        }
                        if(isABomb(row-1, col) == true){
                            count++;
                        }
                        if(isABomb(row-1, col+1) == true){
                            count++;
                        }
                        if(isABomb(row, col+1) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }
                }else{
                    if(row == 0){
                        if(isABomb(row, col-1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col-1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }else if(row > 0 && row < this.grid.length-1){
                        if(isABomb(row-1, col) == true){
                            count++;
                        }
                        if(isABomb(row-1, col-1) == true){
                            count++;
                        }
                        if(isABomb(row, col-1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col-1) == true){
                            count++;
                        }
                        if(isABomb(row+1, col) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }else{
                        if(isABomb(row, col-1) == true){
                            count++;
                        }
                        if(isABomb(row-1, col-1) == true){
                            count++;
                        }
                        if(isABomb(row-1, col) == true){
                            count++;
                        }
                        this.grid[row][col].setName(String.valueOf(count));
                        this.grid[row][col].setValue(String.valueOf(count));
                    }
                }
                count = 0;
            }
        }
}

    public boolean isABomb(int row, int column){
        if(this.grid[row][column].getName().equalsIgnoreCase("bomb")){
            return true;
        }
        return false;
    }

    public String toString(){
        String result = "";
        for(int j = 0; j < this.grid[0].length; j++){
            if(j == 0){
                result += "\t";
            }
            result += (j+1) + "\t";
        }
        result += "\n";

        for(int i = 0; i < this.grid.length; i++){
            if((i+1) < 10){
                result += (i+1) + "     |";
            }else{
                result += (i+1) + "    |";
            }
            for(int j = 0; j < this.grid[0].length; j++){
                String random = "";
                if(this.grid[i][j] == null){
                    random = "null";
                }else if(this.grid[i][j].getName().equals("bomb")){
                    random = " " + this.grid[i][j].getValue() + " ";
                }
                if(j != this.grid[i].length-1){
                    result += random + "    ";
                }else{
                    result += random;
                }
            }
            result += "|\n";
        }
        return result;
    }
}