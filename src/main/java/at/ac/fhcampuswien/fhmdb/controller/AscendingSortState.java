package at.ac.fhcampuswien.fhmdb.controller;

import at.ac.fhcampuswien.fhmdb.models.Movie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Comparator;

public class AscendingSortState implements SortState {
    @Override
    public void sort(ObservableList<Movie> movies) {
        FXCollections.sort(movies, Comparator.comparing(Movie::getTitle));
    }

    @Override
    public SortState nextState() {
        return new DescendingSortState();
    }
}
