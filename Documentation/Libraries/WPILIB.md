# Intro to FRC Programming

## Programming in FRC

Programming in FRC is similar to other contexts but requires familiarity with specific tools, architecture, and practices.

Our code runs on the roboRIO, a small Linux computer on the robot. It connects to hardware like motors, sensors, and cameras. The robot communicates with a laptop running the driver station or the competition field over Wi-Fi to exchange data such as button presses, camera feeds, and enable signals.

Directly interfacing with hardware can be cumbersome. WPILib, an open-source library for FRC, abstracts low-level code, allowing us to focus on high-level control logic. It offers extensive features and documentation for its API and underlying concepts. Vendors often provide libraries for their parts, such as the [Phoenix library](https://v6.docs.ctr-electronics.com/en/stable/) by CTRE, which manufactures most of our motor controllers.

We also use other libraries for tasks WPILib doesn't cover. For example, [Photonvision](../Libraries/VISION.md) processes camera feeds into target information, and Pathplanner helps create and follow paths for the Autonomous portion of a match. These libraries have their own documentation and articles.

## Resources

### Must Read/Watch

- Read our [electrical reference sheet](../General/ElectronicsCrashCourse.md)
  - Understanding the electrical system is crucial for debugging and fixing the robot.
  - Familiarize yourself with the hardware we interact with through software.
  - Alternatively, watch [this video](https://www.youtube.com/watch?v=XHx3JeTk0Qw) on FRC electronics (note: it's somewhat outdated).
- Follow the [installation guide](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-2/wpilib-setup.html).
- Read [WPILib's zero to robot programming guide](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-4/creating-test-drivetrain-program-cpp-java.html).
  - We will write a similar program soon.
  - Use the CTRE tab for example code, as we mostly use CTRE components.

### Optional

- [WPILib docs](https://docs.wpilib.org/en/stable/index.html)
- [WPILib zero to robot guide](https://docs.wpilib.org/en/stable/docs/zero-to-robot/introduction.html)
- [WPILib repo](https://github.com/wpilibsuite/allwpilib)
- [Glossary of jargon](https://docs.wpilib.org/en/stable/docs/software/frc-glossary.html)

### Examples

- After installing WPILib, click the WPILib logo in the upper right corner, then "create a new project" and "examples".
- Review our old codebase.
- Check the kitbot example code in the examples folder of this repo.

### Exercises

- Download and install WPILib.

### Notes

- WPILib handles much of the low-level hardware interface, allowing us to focus on high-level code. This is known as the Hardware Abstraction Layer (HAL).