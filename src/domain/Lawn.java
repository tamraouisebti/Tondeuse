package domain;

import exception.BadlyFormattedInputFileException;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Lawn Class
 * Represents the Lawn to be mown
 * xSize and ySize represent the size of the Lawn
 * The Mowers and thier details
 */
public class Lawn {
    /**
     * the X Size of the Lawn
     */
    private int xSize;
    /**
     * the Y Size of the Lawn
     */
    private int ySize;

    /**
     * the mowers on the field
     */
    private List<Mower> mowers;

    // custom constructor to load the lawn information from the file
    public Lawn(String fileName) {
        File file = new File(fileName);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            initSize(bufferedReader);
            initMowers(bufferedReader);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (BadlyFormattedInputFileException e) {
            System.out.println(e.getMessage());
        }

    }

    //initialize the Size of the Load from the File
    private void initSize(BufferedReader bufferedReader) throws IOException, BadlyFormattedInputFileException {
        String sizeString;
        if ((sizeString = bufferedReader.readLine()) != null) {
            var sizeArray = sizeString.split(" ");
            if (sizeArray.length != 2)
                throw new BadlyFormattedInputFileException();
            this.xSize = Integer.parseInt(sizeArray[0]);
            this.ySize = Integer.parseInt(sizeArray[0]);
        }
    }

    // initialize the Mowers informations from the file
    private void initMowers(BufferedReader bufferedReader) throws IOException, BadlyFormattedInputFileException {
        this.mowers = new ArrayList<>();
        String stringPosition;
        String directionList;
        while (((stringPosition = bufferedReader.readLine()) != null)) {
            var positionArray = stringPosition.split(" ");
            if (positionArray.length != 3)
                throw new BadlyFormattedInputFileException();
            String[] directionArray = null;
            if ((directionList = bufferedReader.readLine()) != null) {
                directionArray = directionList.split("");
            }
            this.mowers.add(mapMower(positionArray, directionArray));
        }
    }

    // map the the positions and orientations from a table of string to classes
    private Mower mapMower(String[] positionArray, String[] directionArray) {
        Position position = new Position(Integer.parseInt(positionArray[0]), Integer.parseInt(positionArray[1]));
        Orientation orientation = Orientation.valueOf(positionArray[2]);
        var directionList = Arrays.stream(directionArray).map(Direction::valueOf).collect(Collectors.toList());

        return new Mower(position, orientation, directionList);
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public List<Mower> getMowers() {
        return mowers;
    }
}
