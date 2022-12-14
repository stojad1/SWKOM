package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.HopArrivalEntity;
import at.fhtw.swen3.persistence.entities.HopEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class HopRepository implements JpaRepository<HopEntity, Long> {

    @Override
    public List<HopEntity> findAll() {
        return null;
    }

    @Override
    public List<HopEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<HopEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<HopEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(HopEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends HopEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends HopEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends HopEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<HopEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends HopEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends HopEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<HopEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public HopEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public HopEntity getById(Long aLong) {
        return null;
    }

    @Override
    public HopEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends HopEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends HopEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends HopEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends HopEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends HopEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends HopEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends HopEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
