package object_relation.structure.concrete_table_inheritance;

import java.sql.SQLException;

public class PlayerMapper extends Mapper {
  private FootballerMapper fmapper;
  private BowlerMapper bmapper;
  private CricketerMapper cmapper;

  public PlayerMapper() {
    this.bmapper = new BowlerMapper();
    this.cmapper = new CricketerMapper();
    this.fmapper = new FootballerMapper();
  }

  @Override
  protected Player find(long id) {
    Player result = null;
    try {
      result = (Player) fmapper.find(id);
      if (result != null) return result;
      result = (Player) bmapper.find(id);
      if (result != null) return result;
      result = (Player) cmapper.find(id);
      if (result != null) return result;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}