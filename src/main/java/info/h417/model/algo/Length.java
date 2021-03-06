package info.h417.model.algo;

import info.h417.model.stream.BaseInputStream;
import info.h417.model.stream.Generator;

import java.io.IOException;

public class Length extends BaseAlgo {

    /**
     * A generic Constructor that takes a generator as parameter
     *
     * @param generator The generator
     */
    public Length(Generator generator) {
        super(generator);
    }


    /**
     * Compute the sum of the length of all the lines contained in the filename.
     *
     * @param filename The filename
     * @return The computed length
     * @throws IOException If some I/O error occurs
     */
    public int begin(String filename) throws IOException {
        int sum = 0;

        BaseInputStream inputStream = generator.getInputStream(filename);
        inputStream.open();
        while (! inputStream.end_of_stream()){
            sum += inputStream.readln().length();
        }
        inputStream.close();

        return sum;
    }
}
