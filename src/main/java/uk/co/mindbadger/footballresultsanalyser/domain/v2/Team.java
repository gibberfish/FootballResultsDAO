package uk.co.mindbadger.footballresultsanalyser.domain.v2;

public interface Team {
    public Integer getTeamId();
    public void setTeamId(Integer teamId);
    
    public String getTeamName();
    public void setTeamName(String teamName);
    
    public String getTeamShortName();
    public void setTeamShortName(String teamShortName);
}