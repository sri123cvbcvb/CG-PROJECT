package com.cg.factoryrobot;

/**
 * Provides hazard risk calculation for factory robots.
 */
public class RobotHazardAuditor {

    /**
     * Calculates and returns the hazard risk score.
     *
     * @param armPrecision precision of robot arm (0.0 to 1.0)
     * @param workerDensity number of workers nearby (1 to 20)
     * @param machineryState state of machinery
     * @return hazard risk score
     * @throws RobotSafetyException if input validation fails
     */
    public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState)
            throws RobotSafetyException {

        // Validate arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        }

        // Validate worker density
        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException("Error: Worker density must be 1-20");
        }

        // Determine machine risk factor
        double machineRiskFactor;

        switch (machineryState) {
            case "Worn":
                machineRiskFactor = 1.3;
                break;
            case "Faulty":
                machineRiskFactor = 2.0;
                break;
            case "Critical":
                machineRiskFactor = 3.0;
                break;
            default:
                throw new RobotSafetyException("Error: Unsupported machinery state");
        }

        // Hazard Risk Formula
        return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
    }
}
