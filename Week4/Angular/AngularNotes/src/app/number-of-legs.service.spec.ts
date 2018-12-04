import { TestBed, inject } from '@angular/core/testing';

import { NumberOfLegsService } from './number-of-legs.service';

describe('NumberOfLegsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [NumberOfLegsService]
    });
  });

  it('should be created', inject([NumberOfLegsService], (service: NumberOfLegsService) => {
    expect(service).toBeTruthy();
  }));
});
