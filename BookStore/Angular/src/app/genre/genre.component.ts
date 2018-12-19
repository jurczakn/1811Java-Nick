import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';

import { GenreService } from '../genre.service';

import { Genre } from '../genre';

@Component({
  selector: 'app-genre',
  templateUrl: './genre.component.html',
  styleUrls: ['./genre.component.css']
})

export class GenreComponent implements OnInit {
  public genre: Genre;
  public genres: Genre[];

  constructor(
    private genreService: GenreService,
    private route: ActivatedRoute,
    private router: Router,
    private location: Location) { }

  ngOnInit() {
    this.genre = new Genre();
    this.genreService.getGenres().subscribe(genres => this.genres = genres);
  }

  submit(): void {
    this.genreService.updateGenre(this.genre).subscribe(
      genre => {
        this.genres.push(genre);
        this.genre = new Genre();
      }
    );
  }
}
