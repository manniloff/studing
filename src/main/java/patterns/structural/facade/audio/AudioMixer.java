package patterns.structural.facade.audio;

import patterns.structural.facade.video.VideoFile;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
