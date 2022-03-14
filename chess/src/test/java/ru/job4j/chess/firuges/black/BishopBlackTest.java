package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testOfPositionMethod() {
        BishopBlack figure = new BishopBlack(Cell.A1);
        assertThat(figure.position(), is(Cell.A1));
    }

    @Test
    public void testOfCopyMethod() {
        Figure figure = new BishopBlack(Cell.A1);
        figure = figure.copy(Cell.A2);
        assertThat(figure.position(), is(Cell.A2));
    }

    @Test
    public void testOfWayMethod00To33() {
        BishopBlack position = new BishopBlack(Cell.A8);
        Cell[] actual = position.way(Cell.D5);
        Cell[] expected = {Cell.B7, Cell.C6, Cell.D5};
        assertThat(actual, is(expected));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayIsNotDiagonal() {
        BishopBlack position = new BishopBlack(Cell.A1);
        position.way(Cell.A2);
    }
}