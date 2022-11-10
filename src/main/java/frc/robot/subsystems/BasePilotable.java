// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BasePilotable extends SubsystemBase {
  /** Creates a new BasePilotable. */

  CANSparkMax neog1 = new CANSparkMax(30, MotorType.kBrushless);

  CANSparkMax neog2 = new CANSparkMax(31, MotorType.kBrushless);


  CANSparkMax neod1 = new CANSparkMax(32, MotorType.kBrushless);
  CANSparkMax neod2 = new CANSparkMax(33, MotorType.kBrushless);



  MotorControllerGroup neog = new MotorControllerGroup(neog1, neog2);
  MotorControllerGroup neod = new MotorControllerGroup(neod1, neod2);

  DifferentialDrive drive = new DifferentialDrive(neog, neod);

  public BasePilotable() {
    neog1.setInverted(false);
    neog2.setInverted(false);
    neod1.setInverted(true);
    neod2.setInverted(true);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  

  public void conduire(double x, double z) {
    drive.arcadeDrive(x,-z);
  }
 















































}
