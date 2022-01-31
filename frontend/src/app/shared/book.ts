export interface Book {
  isbn: string;
  title: string;
  authorList: string[];
  publishDate: Date;
  subtitle: string;
  rating?: number;
  thumbnails?: Thumbnail[];
  description: string;
}
export interface Thumbnail {
  url: string;
  description: string;
}
