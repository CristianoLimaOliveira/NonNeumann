/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.node;

import nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TFalso extends Token
{
    public TFalso()
    {
        super.setText("false");
    }

    public TFalso(int line, int pos)
    {
        super.setText("false");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFalso(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFalso(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFalso text.");
    }
}