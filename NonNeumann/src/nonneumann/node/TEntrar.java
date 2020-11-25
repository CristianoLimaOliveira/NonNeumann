/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.node;

import nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TEntrar extends Token
{
    public TEntrar()
    {
        super.setText("entry");
    }

    public TEntrar(int line, int pos)
    {
        super.setText("entry");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEntrar(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEntrar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEntrar text.");
    }
}
