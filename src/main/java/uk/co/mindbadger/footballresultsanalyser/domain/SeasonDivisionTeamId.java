package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivisionTeamId extends Serializable {
    public SeasonDivision getSeasonDivision();
    public void setSeasonDivision(SeasonDivision seasonDivision);
    
    public Team getTeam();
    public void setTeam(Team team);
}