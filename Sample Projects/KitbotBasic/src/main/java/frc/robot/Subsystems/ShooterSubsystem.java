package frc.robot.Subsystems;

import java.util.function.DoubleSupplier;

import com.ctre.phoenixpro.controls.VoltageOut;
import com.ctre.phoenixpro.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.RunCommand; 
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  // Define the motors for the shooter
  TalonFX leftShooterMotor = new TalonFX(Constants.shooterLeftMotorID);
  TalonFX rightShooterMotor = new TalonFX(Constants.shooterRightMotorID);

  // Define the voltage output for the motors
  VoltageOut leftVoltage = new VoltageOut(0);
  VoltageOut rightVoltage = new VoltageOut(0);

  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {
  }

  // Method to set voltages for the shooter motors
  private void setVoltages(double left, double right) {
    leftShooterMotor.setControl(leftVoltage.withOutput(left));
    rightShooterMotor.setControl(rightVoltage.withOutput(right));
  }

  // Command to set voltages based on joystick input
  public CommandBase setVoltagesCommand(DoubleSupplier left, DoubleSupplier right) {
    return new RunCommand(() -> this.setVoltages(left.getAsDouble(), right.getAsDouble()), this);
  }

  // Command to shoot the ball when joystick is pushed forward
  public CommandBase shootCommand(DoubleSupplier joystickY) {
    return new RunCommand(() -> {
      double speed = joystickY.getAsDouble();
      this.setVoltages(speed, speed);
    }, this);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
