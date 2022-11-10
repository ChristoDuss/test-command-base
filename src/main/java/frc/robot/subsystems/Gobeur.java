// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Validity;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Gobeur extends SubsystemBase {

  DoubleSolenoid piston = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);
  private CANSparkMax moteur = new CANSparkMax(26, MotorType.kBrushless);

  public Gobeur() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }

  public void moteurstop(){
    moteur.set(0.0);
  }
  public void gober(){
    moteur.set(1.0);
  }
  public void vomir(){
    moteur.set(-1.0);
  }
  public void piston(){
    piston.set(Value.kForward);
  }
  public void depiston(){
    piston.set(Value.kReverse);
  }
}

