package org.ceptr.shell;

import java.util.List;
import java.util.Optional;

import javafx.event.Event;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class VisualSemanticBox extends FlowPane {

  // TODO make a cursor both for text and for semantic tree position
  // TODO range selection: how many siblings

  SemanticId semanticId;
  private CeptrLabel semName;
  Group decoration = new Group();
  Group semanticChildren = new Group();
  
  public VisualSemanticBox() {
    semName = getSemName();
    getChildren().setAll(decoration, semanticChildren);
    Border border = mkBorder();
//    List<BorderStroke> strokes = border.getStrokes();
//    strokes.add(borderStroke);
    setBorder(border);
    Button mkChild = new Button("+");
    mkChild.setOnAction(this::mkChild);
    decoration.getChildren().add(mkChild);
  }

  void mkChild(Event e) {
    semanticChildren.getChildren().add(
        new VisualSemanticBox());
  }

  private Border mkBorder() {
    CornerRadii radii = new CornerRadii(2d);
    return new Border(
        new BorderStroke(Color.BLACK,
            BorderStrokeStyle.SOLID,
            radii,
            BorderWidths.DEFAULT));
//    BorderStrokeStyle style = new BorderStrokeStyle(StrokeType.CENTERED,
//        StrokeLineJoin.ROUND,
//        StrokeLineCap.ROUND,
//        -1,
//        -1,
//        null);
//    BorderWidths widths = new BorderWidths(2d);
//    BorderStroke borderStroke = new BorderStroke(
//        Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK,
//        style, style, style, style,
//        radii, widths, null);
//    Border border = new Border(borderStroke);
//    return border;
  }
  
  Optional<SemanticId> getSemanticParent() {
    Parent p = getParent();
    if (p instanceof VisualSemanticBox) {
      SemanticId ret = ((VisualSemanticBox) p).semanticId;
      return Optional.of(ret);
    }
    return Optional.empty();
  }
  
  public CeptrLabel getSemName() {
    if (semName == null) {
      semName = extractSemName();
      Text t = new Text(semName.toString());
      decoration.getChildren().add(t);
    }
    return semName;
  }
  
  /* in js in https://github.com/zippy/ceptr/blob/master/web/js/te.js#L453
    function getSemName(id){
        if (id.id == 0) {
            return "NULL_"+type_names[id.type];
        }
        return CONTEXTS[id.ctx].children[id.type-1].children[id.id-1].children[0].surface;
    }
   */
  private CeptrLabel extractSemName() {
    return new CeptrLabel("shoe size");
  }
}
