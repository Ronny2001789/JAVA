package Chap02.exercises.exer01;

class StreamingSong {
    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Playing song");
    }

    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}

class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong(); // create object
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}




