# Vision Processing

## Vision Processing for FRC

**WIP**  
Vision processing in robotics mimics how humans use their eyes and brain to interpret visual data. Our robots use a camera connected to a coprocessor to process visual input.

We use vision primarily for two purposes: target detection and pose estimation. Target detection involves identifying visual fiducial markers near a target to align and score. Pose estimation is more complex, involving the identification of fiducial markers relative to the robot to estimate its position on the field.

### Retroreflective Tape

Retroreflective (RR) tape reflects light back to its source, making it easier to identify targets. For example, in the Charged Up game, RR tape on cone targets helped with alignment for scoring.

### AprilTags

AprilTags, developed by the University of Michigan, are visual tags similar to QR codes but with fewer pixels, allowing for quick and robust detection. In FRC, AprilTags help robots determine their field position by calculating distance and angle to the tag and mapping this data to a field diagram.

### PhotonVision

PhotonVision is an app and library that simplifies interfacing with the camera and provides utility methods for distance and position data, along with built-in pose estimation features.

### Limelight

Limelight (LL) is a camera and processor system designed for FRC. We used a Limelight 2+ with its software in 2022 for RR tape detection and with PhotonVision software in 2023 for AprilTag detection. The LL2+ was unsatisfactory for AprilTag detection, so we plan to switch to different hardware soon.

### Resources

- [PhotonVision Docs](https://docs.photonvision.org/en/latest/index.html)
- [PhotonVision Repo](https://github.com/PhotonVision/photonvision)
- [WPILib Vision Processing Article](https://docs.wpilib.org/en/stable/docs/software/vision-processing/index.html)

### Examples

- [Official PhotonLib Examples](https://github.com/PhotonVision/photonvision/tree/master/photonlib-java-examples)
- [5026 2023 Code](https://github.com/Iron-Panthers/FRC-2023/blob/037d52ac93f4e46a2518491acd2e195d429d6dbd/src/main/java/frc/robot/subsystems/VisionSubsystem.java)
- [8033 2023 AprilTag Code](https://github.com/HighlanderRobotics/Charged-Up/blob/main/src/main/java/frc/robot/subsystems/ApriltagVisionSubsystem.java)
- [8033 2023 RR Tape Code](https://github.com/HighlanderRobotics/Charged-Up/blob/main/src/main/java/frc/robot/subsystems/TapeVisionSubsystem.java)

### Exercises

- After installing PhotonVision and setting up the web dashboard, experiment with the pipeline tuning settings.
- WIP

### Notes

- PhotonVision is installed on the coprocessor, not your computer. The web dashboard you see is just an interface.
- Last year, we used a Limelight system with a bundled camera and coprocessor. Due to performance issues, we plan to use custom hardware this year. **Still TBD if we’re going to use an OPI or not, so I’ll come back and edit this.**

### What's Next?

- Next course in course progression, if applicable.